package com.example.plathome.estate.real.dto.request;

import com.example.plathome.estate.common.Floor;
import com.example.plathome.estate.common.Option;
import com.example.plathome.estate.common.RentalType;
import com.example.plathome.estate.common.RoomType;
import com.example.plathome.estate.real.domain.Estate;
import com.example.plathome.estate.real.domain.constant.Area;
import com.example.plathome.login.jwt.dto.request.annotation.AjouEmail;
import jakarta.validation.constraints.*;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record EstateForm(
        @AjouEmail String userId,
        @NotBlank @Size(max = 255) String location,
        @NotNull Area area,
        @NotNull RoomType roomType,
        @NotNull RentalType rentalType,
        @NotNull Floor floor,
        @NotNull String contractUrl,
        @NotNull LocalDate contractTerm,
        @NotNull Option option,
        @NotNull @DecimalMin("0.0") @Digits(integer=3, fraction=2) double squareFeet,
        @NotNull @DecimalMin("-180.0") @DecimalMax("180.0") double lng,
        @NotNull @DecimalMin("-90.0") @DecimalMax("90.0") double lat,
        @NotNull @Min(0) int deposit,
        @NotNull @Min(0) int maintenanceFee,
        @NotNull @Min(0) int monthlyRent
) {

    public static EstateFormBuilder of() {
        return EstateForm.builder();
    }

    public Estate toEntity() {
        return Estate.builder()
                .userId(this.userId())
                .location(this.location())
                .area(this.area())
                .roomType(this.roomType())
                .rentalType(this.rentalType())
                .floor(this.floor())
                .contractUrl(this.contractUrl())
                .contractTerm(this.contractTerm())
                .option(this.option())
                .squareFeet(this.squareFeet())
                .lng(this.lng())
                .lat(this.lat())
                .deposit(this.deposit())
                .maintenanceFee(this.maintenanceFee())
                .monthlyRent(this.monthlyRent()).build();
    }
}