
package com.commercetools.importapi.models.business_units;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DivisionBusinessUnitImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DivisionBusinessUnitImportBuilder builder) {
        DivisionBusinessUnitImport divisionBusinessUnitImport = builder.buildUnchecked();
        Assertions.assertThat(divisionBusinessUnitImport).isInstanceOf(DivisionBusinessUnitImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "storeMode",
                        DivisionBusinessUnitImport.builder()
                                .storeMode(com.commercetools.importapi.models.business_units.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { "parentUnit", DivisionBusinessUnitImport.builder()
                        .parentUnit(new com.commercetools.importapi.models.common.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "associateMode", DivisionBusinessUnitImport.builder()
                        .associateMode(com.commercetools.importapi.models.business_units.BusinessUnitAssociateMode
                                .findEnum("Explicit")) },
                new Object[] { "approvalRuleMode", DivisionBusinessUnitImport.builder()
                        .approvalRuleMode(com.commercetools.importapi.models.business_units.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) } };
    }

    @Test
    public void storeMode() {
        DivisionBusinessUnitImport value = DivisionBusinessUnitImport.of();
        value.setStoreMode(
            com.commercetools.importapi.models.business_units.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getStoreMode())
                .isEqualTo(
                    com.commercetools.importapi.models.business_units.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void parentUnit() {
        DivisionBusinessUnitImport value = DivisionBusinessUnitImport.of();
        value.setParentUnit(new com.commercetools.importapi.models.common.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.importapi.models.common.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void associateMode() {
        DivisionBusinessUnitImport value = DivisionBusinessUnitImport.of();
        value.setAssociateMode(
            com.commercetools.importapi.models.business_units.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(
                    com.commercetools.importapi.models.business_units.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void approvalRuleMode() {
        DivisionBusinessUnitImport value = DivisionBusinessUnitImport.of();
        value.setApprovalRuleMode(
            com.commercetools.importapi.models.business_units.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getApprovalRuleMode())
                .isEqualTo(com.commercetools.importapi.models.business_units.BusinessUnitApprovalRuleMode
                        .findEnum("Explicit"));
    }
}
