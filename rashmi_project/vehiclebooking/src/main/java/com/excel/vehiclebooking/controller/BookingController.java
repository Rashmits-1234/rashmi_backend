//package com.excel.vehiclebooking.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.excel.vehiclebooking.response.CommonResponse;
//import com.excel.vehiclebooking.constant.Vehicleconstants;
//import com.excel.vehiclebooking.dto.BookinDto;
//import com.excel.vehiclebooking.dto.BookingListDto;
//import com.excel.vehiclebooking.dto.VehicleListDto;
//import com.excel.vehiclebooking.dto.VehicleRegistrationDto;
//import com.excel.vehiclebooking.service.BookingService;
//
//
//@CrossOrigin
//@RestController
//@RequestMapping(path = "/addbook/api")
//public class BookingController {
//    @Autowired
//    private BookingService bookingService;
//
//    @PostMapping(path = "/booking")
//    public ResponseEntity<CommonResponse<String>> postBookingInfo(@RequestBody BookingListDto dto) {
//        String bookingId = bookingService.saveBoookingInfo(dto);
//
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(CommonResponse.<String>builder().data(bookingId).message("Booking info Saved").build());
//    }
//
package com.excel.vehiclebooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.excel.vehiclebooking.constant.Vehicleconstants;
import com.excel.vehiclebooking.dto.BookinDto;
import com.excel.vehiclebooking.dto.BookingListDto;
import com.excel.vehiclebooking.response.CommonResponse;
import com.excel.vehiclebooking.service.BookingService;

@CrossOrigin
@RestController
@RequestMapping(path = "/addbook/api")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(path = "/booking")
    public ResponseEntity<CommonResponse<String>> postBookingInfo(@RequestBody BookingListDto dto) {
        String bookingId = bookingService.saveBoookingInfo(dto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<String>builder().data(bookingId).message("Booking info Saved").build());
    }

    @GetMapping("/getbooking")
    public ResponseEntity<List<BookinDto>> fetchAllBooking() {
        return ResponseEntity.ok(bookingService.getAllBooking());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BookinDto> getVehicle(@PathVariable Integer id) {
        BookinDto booking = bookingService.getBooking(id);
        return ResponseEntity.status(HttpStatus.OK).body(booking);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmployee(@RequestBody BookingListDto dto) {
        bookingService.deleteBooking(dto);
        return ResponseEntity.ok(Vehicleconstants.DELETE_SUCCESS);
    }

    @PutMapping("/update")
    public ResponseEntity<CommonResponse<Integer>> updateEmployee(@RequestBody BookinDto dto) {
        Integer updateBooking = bookingService.updateBooking(dto);
        return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<Integer>builder().data(updateBooking)
                .message("Updated Booking Details").isError(false).build());
    }
}

