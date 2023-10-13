
package com.commercetools.api.models.type;

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
public class TypeUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeUpdateBuilder builder) {
        TypeUpdate typeUpdate = builder.buildUnchecked();
        Assertions.assertThat(typeUpdate).isInstanceOf(TypeUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeUpdate.builder().version(2L) }, new Object[] { TypeUpdate.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.type.TypeUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        TypeUpdate value = TypeUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        TypeUpdate value = TypeUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.type.TypeUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.type.TypeUpdateActionImpl()));
    }
}
