
package com.commercetools.api.models.customer_group;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CustomerGroupDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupDraftBuilder builder) {
        CustomerGroupDraft customerGroupDraft = builder.buildUnchecked();
        Assertions.assertThat(customerGroupDraft).isInstanceOf(CustomerGroupDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupDraft.builder().key("key") },
                new Object[] { CustomerGroupDraft.builder().groupName("groupName") },
                new Object[] { CustomerGroupDraft.builder()
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
