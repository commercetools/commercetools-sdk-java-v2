
package com.commercetools.api.models.common;

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
public class CreatedByTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CreatedByBuilder builder) {
        CreatedBy createdBy = builder.buildUnchecked();
        Assertions.assertThat(createdBy).isInstanceOf(CreatedBy.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CreatedBy.builder().clientId("clientId") },
                new Object[] { CreatedBy.builder().externalUserId("externalUserId") },
                new Object[] { CreatedBy.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { CreatedBy.builder().anonymousId("anonymousId") },
                new Object[] {
                        CreatedBy.builder().attributedTo(new com.commercetools.api.models.common.AttributionImpl()) },
                new Object[] { CreatedBy.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void clientId() {
        CreatedBy value = CreatedBy.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void externalUserId() {
        CreatedBy value = CreatedBy.of();
        value.setExternalUserId("externalUserId");
        Assertions.assertThat(value.getExternalUserId()).isEqualTo("externalUserId");
    }

    @Test
    public void customer() {
        CreatedBy value = CreatedBy.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void anonymousId() {
        CreatedBy value = CreatedBy.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void attributedTo() {
        CreatedBy value = CreatedBy.of();
        value.setAttributedTo(new com.commercetools.api.models.common.AttributionImpl());
        Assertions.assertThat(value.getAttributedTo())
                .isEqualTo(new com.commercetools.api.models.common.AttributionImpl());
    }

    @Test
    public void associate() {
        CreatedBy value = CreatedBy.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
