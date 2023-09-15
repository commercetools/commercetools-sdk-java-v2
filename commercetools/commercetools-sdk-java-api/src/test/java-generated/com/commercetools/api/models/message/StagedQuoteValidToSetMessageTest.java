
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

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
public class StagedQuoteValidToSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteValidToSetMessageBuilder builder) {
        StagedQuoteValidToSetMessage stagedQuoteValidToSetMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteValidToSetMessage).isInstanceOf(StagedQuoteValidToSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                StagedQuoteValidToSetMessage.builder().validTo(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validTo() {
        StagedQuoteValidToSetMessage value = StagedQuoteValidToSetMessage.of();
        value.setValidTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidTo()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
