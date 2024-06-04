package com.excel.vehiclebooking.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class CommonResponse<T> {
 private T data;
 private boolean isError;
 private String message;
  
}