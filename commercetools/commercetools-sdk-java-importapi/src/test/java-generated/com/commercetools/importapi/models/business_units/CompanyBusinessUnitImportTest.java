
package com.commercetools.importapi.models.business_units;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CompanyBusinessUnitImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CompanyBusinessUnitImportBuilder builder) {
        CompanyBusinessUnitImport companyBusinessUnitImport = builder.buildUnchecked();
        Assertions.assertThat(companyBusinessUnitImport).isInstanceOf(CompanyBusinessUnitImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "storeMode", CompanyBusinessUnitImport.builder()
                .storeMode(
                    com.commercetools.importapi.models.business_units.BusinessUnitStoreMode.findEnum("Explicit")) } };
    }

    @Test
    public void storeMode() {
        CompanyBusinessUnitImport value = CompanyBusinessUnitImport.of();
        value.setStoreMode(
            com.commercetools.importapi.models.business_units.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getStoreMode())
                .isEqualTo(
                    com.commercetools.importapi.models.business_units.BusinessUnitStoreMode.findEnum("Explicit"));
    }
}
