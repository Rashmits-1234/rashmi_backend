package com.excel.vehiclebooking.service;

import java.util.List;

import com.excel.vehiclebooking.dto.BookinDto;
import com.excel.vehiclebooking.dto.BookingListDto;
public interface BookingService {
    String saveBoookingInfo(BookingListDto dto);
    List<BookinDto> getAllBooking();
    BookinDto getBooking(Integer id);
    void deleteBooking(BookingListDto dto);
    Integer updateBooking(BookinDto dto);
}
