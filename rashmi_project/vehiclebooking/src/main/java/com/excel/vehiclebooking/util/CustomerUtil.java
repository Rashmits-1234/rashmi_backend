package com.excel.vehiclebooking.util;

import com.excel.vehiclebooking.dto.BookinDto;
import com.excel.vehiclebooking.dto.BookingListDto;
import com.excel.vehiclebooking.dto.CustomerRegistrationDto;
import com.excel.vehiclebooking.entity.Booking;
import com.excel.vehiclebooking.entity.CustomerRegistration;
import org.springframework.stereotype.Component;

@Component
public class CustomerUtil {

	public static Booking dtoToBookingEntity(BookingListDto dto) {
        return Booking.builder()
                .bookingDate(dto.getBooking().get(0).getBookingDate()) 
                .build();
    }

    public static BookinDto bookingEntityToDto(Booking entity) {
        return BookinDto.builder()
                .bookingDate(entity.getBookingDate())
                .build();
    }


    public static CustomerRegistration dtoToCustomerRegistrationEntity(CustomerRegistrationDto dto) {
        return CustomerRegistration.builder()
                .customerRegId(dto.getCustomerRegId())
                .customerName(dto.getCustomerName())
                .customerPassword(dto.getCustomerPassword())
                .customerEmail(dto.getCustomerEmail())
                .customerPhoneNumber(dto.getCustomerPhoneNumber())
                .customerAddress(dto.getCustomerAddress())
                .customerCity(dto.getCustomerCity())
                .build();
    }
    public CustomerRegistrationDto customerRegistrationEntityToDto(CustomerRegistration entity) {
        return CustomerRegistrationDto.builder()
                .customerRegId(entity.getCustomerRegId())
                .customerName(entity.getCustomerName())
                .customerPassword(entity.getCustomerPassword())
                .customerEmail(entity.getCustomerEmail())
                .customerPhoneNumber(entity.getCustomerPhoneNumber())
                .customerAddress(entity.getCustomerAddress())
                .customerCity(entity.getCustomerCity())
                .build();
    }
}

