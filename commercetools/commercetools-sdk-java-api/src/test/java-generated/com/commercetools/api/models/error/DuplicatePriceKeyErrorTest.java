
package com.commercetools.api.models.error;

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
public class DuplicatePriceKeyErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicatePriceKeyErrorBuilder builder) {
        DuplicatePriceKeyError duplicatePriceKeyError = builder.buildUnchecked();
        Assertions.assertThat(duplicatePriceKeyError).isInstanceOf(DuplicatePriceKeyError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicatePriceKeyError.builder().message("message") },
                new Object[] { DuplicatePriceKeyError.builder()
                        .conflictingPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void message() {
        DuplicatePriceKeyError value = DuplicatePriceKeyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingPrice() {
        DuplicatePriceKeyError value = DuplicatePriceKeyError.of();
        value.setConflictingPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getConflictingPrice())
                .isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
