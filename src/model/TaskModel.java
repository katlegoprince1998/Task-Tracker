package model;

import java.time.LocalDate;

public record TaskModel(int id, String description, String status, LocalDate createAt, LocalDate updatedAt) {
}
