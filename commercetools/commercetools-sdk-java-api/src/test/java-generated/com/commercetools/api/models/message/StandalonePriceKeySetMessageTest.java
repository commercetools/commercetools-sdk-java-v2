
package com.commercetools.api.models.message;

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
public class StandalonePriceKeySetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StandalonePriceKeySetMessageBuilder builder) {
        StandalonePriceKeySetMessage standalonePriceKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceKeySetMessage).isInstanceOf(StandalonePriceKeySetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StandalonePriceKeySetMessage.builder().key("key") },
                new Object[] { StandalonePriceKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        StandalonePriceKeySetMessage value = StandalonePriceKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        StandalonePriceKeySetMessage value = StandalonePriceKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
