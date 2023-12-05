
package com.commercetools.api.models.subscription;

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
public class PayloadNotIncludedTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PayloadNotIncludedBuilder builder) {
        PayloadNotIncluded payloadNotIncluded = builder.buildUnchecked();
        Assertions.assertThat(payloadNotIncluded).isInstanceOf(PayloadNotIncluded.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PayloadNotIncluded.builder().reason("reason") },
                new Object[] { PayloadNotIncluded.builder().payloadType("payloadType") } };
    }

    @Test
    public void reason() {
        PayloadNotIncluded value = PayloadNotIncluded.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }

    @Test
    public void payloadType() {
        PayloadNotIncluded value = PayloadNotIncluded.of();
        value.setPayloadType("payloadType");
        Assertions.assertThat(value.getPayloadType()).isEqualTo("payloadType");
    }
}
