
package com.commercetools.api.models.order;

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
public class HitTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(HitBuilder builder) {
        Hit hit = builder.buildUnchecked();
        Assertions.assertThat(hit).isInstanceOf(Hit.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Hit.builder().id("id") }, new Object[] { Hit.builder().version(2L) },
                new Object[] { Hit.builder().relevance(0.5586561) } };
    }

    @Test
    public void id() {
        Hit value = Hit.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Hit value = Hit.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void relevance() {
        Hit value = Hit.of();
        value.setRelevance(0.5586561);
        Assertions.assertThat(value.getRelevance()).isEqualTo(0.5586561);
    }
}
