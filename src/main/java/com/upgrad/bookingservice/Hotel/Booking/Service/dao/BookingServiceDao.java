package com.upgrad.bookingservice.Hotel.Booking.Service.dao;

import com.upgrad.bookingservice.Hotel.Booking.Service.entity.BookingInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
        public interface BookingServiceDao extends JpaRepository<BookingInfoEntity,Integer> {

}
