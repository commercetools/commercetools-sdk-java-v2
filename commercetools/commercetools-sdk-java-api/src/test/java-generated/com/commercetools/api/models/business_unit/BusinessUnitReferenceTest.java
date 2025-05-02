
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitReferenceBuilder builder) {
        BusinessUnitReference businessUnitReference = builder.buildUnchecked();
        Assertions.assertThat(businessUnitReference).isInstanceOf(BusinessUnitReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        BusinessUnitReference.builder()
                                .obj(new com.commercetools.api.models.business_unit.BusinessUnitImpl()) },
                new Object[] { "id", BusinessUnitReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        BusinessUnitReference value = BusinessUnitReference.of();
        value.setObj(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitImpl());
    }

    @Test
    public void id() {
        BusinessUnitReference value = BusinessUnitReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
