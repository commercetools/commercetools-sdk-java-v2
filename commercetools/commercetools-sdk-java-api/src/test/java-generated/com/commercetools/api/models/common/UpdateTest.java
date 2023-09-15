
package com.commercetools.api.models.common;

import java.util.Collections;

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
public class UpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(UpdateBuilder builder) {
        Update update = builder.buildUnchecked();
        Assertions.assertThat(update).isInstanceOf(Update.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Update.builder().version(2L) }, new Object[] { Update.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.common.UpdateActionImpl())) } };
    }

    @Test
    public void version() {
        Update value = Update.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        Update value = Update.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.common.UpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.UpdateActionImpl()));
    }
}
