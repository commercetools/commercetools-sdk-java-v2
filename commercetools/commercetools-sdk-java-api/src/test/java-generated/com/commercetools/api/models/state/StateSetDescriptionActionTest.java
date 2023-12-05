
package com.commercetools.api.models.state;

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
public class StateSetDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateSetDescriptionActionBuilder builder) {
        StateSetDescriptionAction stateSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetDescriptionAction).isInstanceOf(StateSetDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateSetDescriptionAction.builder()
                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        StateSetDescriptionAction value = StateSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
