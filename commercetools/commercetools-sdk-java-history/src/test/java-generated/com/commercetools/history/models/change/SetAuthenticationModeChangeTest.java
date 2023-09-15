
package com.commercetools.history.models.change;

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
public class SetAuthenticationModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAuthenticationModeChangeBuilder builder) {
        SetAuthenticationModeChange setAuthenticationModeChange = builder.buildUnchecked();
        Assertions.assertThat(setAuthenticationModeChange).isInstanceOf(SetAuthenticationModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAuthenticationModeChange.builder().change("change") },
                new Object[] { SetAuthenticationModeChange.builder()
                        .previousValue(
                            com.commercetools.history.models.common.AuthenticationMode.findEnum("Password")) },
                new Object[] { SetAuthenticationModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password")) } };
    }

    @Test
    public void change() {
        SetAuthenticationModeChange value = SetAuthenticationModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAuthenticationModeChange value = SetAuthenticationModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
    }

    @Test
    public void nextValue() {
        SetAuthenticationModeChange value = SetAuthenticationModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
    }
}
