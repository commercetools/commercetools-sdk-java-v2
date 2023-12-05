
package com.commercetools.api.models.standalone_price;

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
public class StandalonePriceReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceReferenceBuilder builder) {
        StandalonePriceReference standalonePriceReference = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceReference).isInstanceOf(StandalonePriceReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceReference.builder()
                .obj(new com.commercetools.api.models.standalone_price.StandalonePriceImpl()) } };
    }

    @Test
    public void obj() {
        StandalonePriceReference value = StandalonePriceReference.of();
        value.setObj(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StandalonePriceImpl());
    }
}
