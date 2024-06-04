package com.excel.vehiclebooking.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.vehiclebooking.dto.BookinDto;
import com.excel.vehiclebooking.dto.BookingListDto;
import com.excel.vehiclebooking.entity.Booking;
import com.excel.vehiclebooking.exception.BookingNotFoundException;
import com.excel.vehiclebooking.repository.BookingRepository;
import com.excel.vehiclebooking.util.CustomerUtil;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public String saveBoookingInfo(BookingListDto dto) {
      if(dto.getBooking().get(0).getBookingDate().isBefore(LocalDate.now()))
          throw new BookingNotFoundException("Invalid Date:");
        Booking booking = CustomerUtil.dtoToBookingEntity(dto);
        bookingRepository.save(booking);
        return booking.getBookingId().toString();
    }

    @Override
    public List<BookinDto> getAllBooking() {
        return bookingRepository.findAll()
                .stream()
                .map(CustomerUtil::bookingEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookinDto getBooking(Integer id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        if (booking.isPresent()) {
            return CustomerUtil.bookingEntityToDto(booking.get());
        } else {
            throw new BookingNotFoundException("Booking not found with id: " + id);
        }
    }

    @Override
    public void deleteBooking(BookingListDto dto) {
        Booking booking = CustomerUtil.dtoToBookingEntity(dto);
        bookingRepository.delete(booking);
    }

    @Override
    public Integer updateBooking(BookinDto dto) {
        Optional<Booking> optionalBooking = bookingRepository.findByBookingId(dto.getBookingId());
        if (optionalBooking.isPresent()) {
            Booking booking = optionalBooking.get();
            booking.setBookingDate(dto.getBookingDate());
            bookingRepository.save(booking);
            return booking.getBookingId();
        } else {
            throw new BookingNotFoundException("Booking not found with id: " + dto.getBookingId());
        }
    }
}