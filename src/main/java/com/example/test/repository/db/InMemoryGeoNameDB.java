package com.example.test.repository.db;

import com.example.test.domain.GeoName;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Component
public class InMemoryGeoNameDB {
    private final List<GeoName> tableOfGeoNames = new ArrayList<>();

    public InMemoryGeoNameDB() {
        GeoName tupleGeoName1 = new GeoName();
        tupleGeoName1.setId(6058560);
        tupleGeoName1.setName("London");
        tupleGeoName1.setAsciiName("London");
        tupleGeoName1.setAlternateName("London,Londonas,Londono,YXU,leondeon,lndn,lndn,antaryw,londoni,lun dui,lun dun,lwndwn,rondon,Лондон,לונדון,لندن,لندن، انتاریو,لندن،,اونٹاریو,ლონდონი,ロンドン,伦敦,런던");
        tupleGeoName1.setLatitude(42.98339);
        tupleGeoName1.setLongitude(-81.23304);
        tupleGeoName1.setFeatureClass("P");
        tupleGeoName1.setFeatureCode("PPL");
        tupleGeoName1.setCountryCode("CA");
        tupleGeoName1.setCc2("");
        tupleGeoName1.setAdmin1Code("8");
        tupleGeoName1.setAdmin2Code("");
        tupleGeoName1.setAdmin3Code("");
        tupleGeoName1.setAdmin4Code("");
        tupleGeoName1.setPopulation(BigInteger.valueOf(346765));
        tupleGeoName1.setElevations(0);
        tupleGeoName1.setDem(252);
        tupleGeoName1.setTimezone(TimeZone.getTimeZone("America/Toronto").getID());
        tupleGeoName1.setModifiedAt(LocalDate.of(2012, 8, 19));

        GeoName tupleGeoName2 = new GeoName();
        tupleGeoName2.setId(4298960);
        tupleGeoName2.setName("London");
        tupleGeoName2.setAsciiName("London");
        tupleGeoName2.setAlternateName("LOZ");
        tupleGeoName2.setLatitude(37.12898);
        tupleGeoName2.setLongitude(-84.08326);
        tupleGeoName2.setFeatureClass("P");
        tupleGeoName2.setFeatureCode("PPLA2");
        tupleGeoName2.setCountryCode("US");
        tupleGeoName2.setCc2("");
        tupleGeoName2.setAdmin1Code("KY");
        tupleGeoName2.setAdmin2Code("125");
        tupleGeoName2.setAdmin3Code("");
        tupleGeoName2.setAdmin4Code("");
        tupleGeoName2.setPopulation(BigInteger.valueOf(7993));
        tupleGeoName2.setElevations(378);
        tupleGeoName2.setDem(379);
        tupleGeoName2.setTimezone(TimeZone.getTimeZone("America/New_York").getID());
        tupleGeoName2.setModifiedAt(LocalDate.of(2011, 5, 14));

        GeoName tupleGeoName3 = new GeoName();
        tupleGeoName3.setId(4361094);
        tupleGeoName3.setName("Londontowne");
        tupleGeoName3.setAsciiName("Londontowne");
        tupleGeoName3.setAlternateName("");
        tupleGeoName3.setLatitude(38.93345);
        tupleGeoName3.setLongitude(-76.54941);
        tupleGeoName3.setFeatureClass("P");
        tupleGeoName3.setFeatureCode("PPL");
        tupleGeoName3.setCountryCode("US");
        tupleGeoName3.setCc2("");
        tupleGeoName3.setAdmin1Code("MD");
        tupleGeoName3.setAdmin2Code("3");
        tupleGeoName3.setAdmin3Code("");
        tupleGeoName3.setAdmin4Code("");
        tupleGeoName3.setPopulation(BigInteger.valueOf(8018));
        tupleGeoName3.setElevations(6);
        tupleGeoName3.setDem(6);
        tupleGeoName3.setTimezone(TimeZone.getTimeZone("America/New_York").getID());
        tupleGeoName3.setModifiedAt(LocalDate.of(2010, 2, 15));

        GeoName tupleGeoName4 = new GeoName();
        tupleGeoName4.setId(4517009);
        tupleGeoName4.setName("London");
        tupleGeoName4.setAsciiName("London");
        tupleGeoName4.setAlternateName("");
        tupleGeoName4.setLatitude(39.88645);
        tupleGeoName4.setLongitude(-83.44825);
        tupleGeoName4.setFeatureClass("P");
        tupleGeoName4.setFeatureCode("PPLA2");
        tupleGeoName4.setCountryCode("US");
        tupleGeoName4.setCc2("");
        tupleGeoName4.setAdmin1Code("OH");
        tupleGeoName4.setAdmin2Code("97");
        tupleGeoName4.setAdmin3Code("");
        tupleGeoName4.setAdmin4Code("");
        tupleGeoName4.setPopulation(BigInteger.valueOf(9904));
        tupleGeoName4.setElevations(321);
        tupleGeoName4.setDem(321);
        tupleGeoName4.setTimezone(TimeZone.getTimeZone("America/New_York").getID());
        tupleGeoName4.setModifiedAt(LocalDate.of(2011, 5, 14));

        GeoName tupleGeoName5 = new GeoName();
        tupleGeoName5.setId(4398103);
        tupleGeoName5.setName("Mexico");
        tupleGeoName5.setAsciiName("Mexico");
        tupleGeoName5.setAlternateName("");
        tupleGeoName5.setLatitude(39.16976);
        tupleGeoName5.setLongitude(-91.88295);
        tupleGeoName5.setFeatureClass("P");
        tupleGeoName5.setFeatureCode("PPLA2");
        tupleGeoName5.setCountryCode("US");
        tupleGeoName5.setCc2("");
        tupleGeoName5.setAdmin1Code("MO");
        tupleGeoName5.setAdmin2Code("7");
        tupleGeoName5.setAdmin3Code("");
        tupleGeoName5.setAdmin4Code("");
        tupleGeoName5.setPopulation(BigInteger.valueOf(11543));
        tupleGeoName5.setElevations(244);
        tupleGeoName5.setDem(247);
        tupleGeoName5.setTimezone(TimeZone.getTimeZone("America/Chicago").getID());
        tupleGeoName5.setModifiedAt(LocalDate.of(2011, 5, 14));

        tableOfGeoNames.add(tupleGeoName1);
        tableOfGeoNames.add(tupleGeoName2);
        tableOfGeoNames.add(tupleGeoName3);
        tableOfGeoNames.add(tupleGeoName4);
        tableOfGeoNames.add(tupleGeoName5);
    }

    public List<GeoName> filterBySuggestions(String partialSearch, Double latitude, Double longitude) {
        List<GeoName> suggestions = new ArrayList<>();

        for (GeoName tuple : tableOfGeoNames) {
            int suggestion = tuple.getName().indexOf(partialSearch);

            if (suggestion != -1) {
                GeoName geoNameFiltered = new GeoName();

                geoNameFiltered.setName(
                        tuple.getName() + ", " +
                        tuple.getCountryCode() + ", " +
                        tuple.getAsciiName()
                );
                geoNameFiltered.setLatitude(tuple.getLatitude());
                geoNameFiltered.setLongitude(tuple.getLongitude());
                geoNameFiltered.setScore(tuple.getScore());

                suggestions.add(geoNameFiltered);
            }
        }

        return suggestions;
    }
}
