
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DivisionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DivisionDraftBuilder builder) {
        DivisionDraft divisionDraft = builder.buildUnchecked();
        Assertions.assertThat(divisionDraft).isInstanceOf(DivisionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parentUnit", DivisionDraft.builder()
                .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "storeMode",
                        DivisionDraft.builder()
                                .storeMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { "associateMode",
                        DivisionDraft.builder()
                                .associateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) },
                new Object[] { "approvalRuleMode", DivisionDraft.builder()
                        .approvalRuleMode(com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) } };
    }

    @Test
    public void parentUnit() {
        DivisionDraft value = DivisionDraft.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void storeMode() {
        DivisionDraft value = DivisionDraft.of();
        value.setStoreMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getStoreMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void associateMode() {
        DivisionDraft value = DivisionDraft.of();
        value.setAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void approvalRuleMode() {
        DivisionDraft value = DivisionDraft.of();
        value.setApprovalRuleMode(
            com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getApprovalRuleMode())
                .isEqualTo(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }
}
