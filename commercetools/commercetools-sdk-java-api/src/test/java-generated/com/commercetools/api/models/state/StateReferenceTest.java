
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
public class StateReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateReferenceBuilder builder) {
        StateReference stateReference = builder.buildUnchecked();
        Assertions.assertThat(stateReference).isInstanceOf(StateReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StateReference.builder().obj(new com.commercetools.api.models.state.StateImpl()) },
                new Object[] { StateReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        StateReference value = StateReference.of();
        value.setObj(new com.commercetools.api.models.state.StateImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.state.StateImpl());
    }

    @Test
    public void id() {
        StateReference value = StateReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
