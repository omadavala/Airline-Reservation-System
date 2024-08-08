Airline Reservation System
Overview
-----------------------------
The Airline Reservation System is a simple Java application that simulates the process of booking flights. The system allows users to add flights, view available flights, and book seats on flights. This project demonstrates object-oriented programming principles and provides a basic framework for an airline booking system.

Features
--------------------------------
Flight Management: Add and view available flights.
Booking System: Book a seat on a flight and view all bookings.
Console-Based Interface: Simple command-line interface for interaction.

Project Structure
-------------------------------------
The project consists of the following classes:

Flight: Represents individual flights with details such as flight number, destination, departure time, and available seats.
Booking: Represents a booking made by a passenger, including the passenger's name, flight number, and seat number.
AirlineReservationSystem: Manages the overall system, including flight listings and bookings.

Prerequisites
------------------------------------------
Java Development Kit (JDK) 8 or higher.
A Java IDE or a simple text editor with command-line access to javac and java commands.

Usage
-------------------
Adding Flights
The system automatically adds predefined flights when it starts. You can modify the code in the main method of AirlineReservationSystem to add more flights.

Viewing Available Flights
The system lists all available flights when it starts. The flight details include the flight number, destination, departure time, and the number of available seats.

Booking a Flight
To book a flight, the system calls the bookFlight method, which checks for seat availability and confirms the booking. The booking details are then stored and displayed.
