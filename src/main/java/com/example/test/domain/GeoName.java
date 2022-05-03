package com.example.test.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class GeoName {

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String asciiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String alternateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String featureClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String featureCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String countryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cc2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String admin1Code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String admin2Code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String admin3Code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String admin4Code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger population;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int elevations;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int dem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDate modifiedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsciiName() {
        return asciiName;
    }

    public void setAsciiName(String asciiName) {
        this.asciiName = asciiName;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getFeatureClass() {
        return featureClass;
    }

    public void setFeatureClass(String featureClass) {
        this.featureClass = featureClass;
    }

    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCc2() {
        return cc2;
    }

    public void setCc2(String cc2) {
        this.cc2 = cc2;
    }

    public String getAdmin1Code() {
        return admin1Code;
    }

    public void setAdmin1Code(String admin1Code) {
        this.admin1Code = admin1Code;
    }

    public String getAdmin2Code() {
        return admin2Code;
    }

    public void setAdmin2Code(String admin2Code) {
        this.admin2Code = admin2Code;
    }

    public String getAdmin3Code() {
        return admin3Code;
    }

    public void setAdmin3Code(String admin3Code) {
        this.admin3Code = admin3Code;
    }

    public String getAdmin4Code() {
        return admin4Code;
    }

    public void setAdmin4Code(String admin4Code) {
        this.admin4Code = admin4Code;
    }

    public BigInteger getPopulation() {
        return population;
    }

    public void setPopulation(BigInteger population) {
        this.population = population;
    }

    public int getElevations() {
        return elevations;
    }

    public void setElevations(int elevations) {
        this.elevations = elevations;
    }

    public int getDem() {
        return dem;
    }

    public void setDem(int dem) {
        this.dem = dem;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoName)) return false;
        GeoName geoName = (GeoName) o;
        return id == geoName.id && elevations == geoName.elevations && dem == geoName.dem && Objects.equals(name, geoName.name) && Objects.equals(asciiName, geoName.asciiName) && Objects.equals(alternateName, geoName.alternateName) && Objects.equals(latitude, geoName.latitude) && Objects.equals(longitude, geoName.longitude) && Objects.equals(featureClass, geoName.featureClass) && Objects.equals(featureCode, geoName.featureCode) && Objects.equals(countryCode, geoName.countryCode) && Objects.equals(cc2, geoName.cc2) && Objects.equals(admin1Code, geoName.admin1Code) && Objects.equals(admin2Code, geoName.admin2Code) && Objects.equals(admin3Code, geoName.admin3Code) && Objects.equals(admin4Code, geoName.admin4Code) && Objects.equals(population, geoName.population) && Objects.equals(timezone, geoName.timezone) && Objects.equals(modifiedAt, geoName.modifiedAt) && Objects.equals(score, geoName.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, asciiName, alternateName, latitude, longitude, featureClass, featureCode, countryCode, cc2, admin1Code, admin2Code, admin3Code, admin4Code, population, elevations, dem, timezone, modifiedAt, score);
    }

    @Override
    public String toString() {
        return "GeoName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", asciiName='" + asciiName + '\'' +
                ", alternateName='" + alternateName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", featureClass='" + featureClass + '\'' +
                ", featureCode='" + featureCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", cc2='" + cc2 + '\'' +
                ", admin1Code='" + admin1Code + '\'' +
                ", admin2Code='" + admin2Code + '\'' +
                ", admin3Code='" + admin3Code + '\'' +
                ", admin4Code='" + admin4Code + '\'' +
                ", population=" + population +
                ", elevations=" + elevations +
                ", dem=" + dem +
                ", timezone='" + timezone + '\'' +
                ", modifiedAt=" + modifiedAt +
                ", score=" + score +
                '}';
    }
}
