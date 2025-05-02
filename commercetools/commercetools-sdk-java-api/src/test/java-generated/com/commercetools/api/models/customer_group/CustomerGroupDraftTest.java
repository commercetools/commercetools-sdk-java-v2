
package com.commercetools.api.models.customer_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupDraftBuilder builder) {
        CustomerGroupDraft customerGroupDraft = builder.buildUnchecked();
        Assertions.assertThat(customerGroupDraft).isInstanceOf(CustomerGroupDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomerGroupDraft.builder().key("key") },
                new Object[] { "groupName", CustomerGroupDraft.builder().groupName("groupName") },
                new Object[] { "custom", CustomerGroupDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        CustomerGroupDraft value = CustomerGroupDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void groupName() {
        CustomerGroupDraft value = CustomerGroupDraft.of();
        value.setGroupName("groupName");
        Assertions.assertThat(value.getGroupName()).isEqualTo("groupName");
    }

    @Test
    public void custom() {
        CustomerGroupDraft value = CustomerGroupDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
