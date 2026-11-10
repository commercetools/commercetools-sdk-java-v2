
package com.commercetools.api.models.customer_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupReferenceBuilder builder) {
        CustomerGroupReference customerGroupReference = builder.buildUnchecked();
        Assertions.assertThat(customerGroupReference).isInstanceOf(CustomerGroupReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        CustomerGroupReference.builder()
                                .obj(new com.commercetools.api.models.customer_group.CustomerGroupImpl()) },
                new Object[] { "id", CustomerGroupReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CustomerGroupReference value = CustomerGroupReference.of();
        value.setObj(new com.commercetools.api.models.customer_group.CustomerGroupImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupImpl());
    }

    @Test
    public void id() {
        CustomerGroupReference value = CustomerGroupReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
