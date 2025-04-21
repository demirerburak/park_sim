# park_sim
Java Object-Oriented Car Park Management System

# Assignment Description

# Vehicle Class
Represents a vehicle with a license plate number (String) and a size (int).
Size values: 1 = motorcycle, 2 = car, 4 = truck.

# ParkPlace Class
Represents a parking place allocated to a single vehicle.
Fields: size: int, vehicle: Vehicle.

# Ticket Class
Tracks a vehicle’s entry and exit times and calculates parking fees.
Fields: vehicle: Vehicle, entryDate: java.util.Date, exitDate: java.util.Date, totalPrice: double, static numberOfTickets: int.

# CarPark Class
Manages parking places and tickets.
Fields: capacity: int, hourlyPrice: double, ParkPlace[] parkPlaceArray, Ticket[] ticketArray.
