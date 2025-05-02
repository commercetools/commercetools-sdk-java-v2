
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyDivisionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyDivisionDraftBuilder builder) {
        MyDivisionDraft myDivisionDraft = builder.buildUnchecked();
        Assertions.assertThat(myDivisionDraft).isInstanceOf(MyDivisionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parentUnit", MyDivisionDraft.builder()
                .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void parentUnit() {
        MyDivisionDraft value = MyDivisionDraft.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
