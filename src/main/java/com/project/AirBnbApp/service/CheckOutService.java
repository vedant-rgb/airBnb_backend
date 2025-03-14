package com.project.AirBnbApp.service;

import com.project.AirBnbApp.entities.Booking;

public interface CheckOutService {

    String getCheckOutSession(Booking booking, String successUrl, String failureUrl);

}
