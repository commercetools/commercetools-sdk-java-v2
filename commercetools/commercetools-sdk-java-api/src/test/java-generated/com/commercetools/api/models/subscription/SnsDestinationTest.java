
package com.commercetools.api.models.subscription;

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
public class SnsDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SnsDestinationBuilder builder) {
        SnsDestination snsDestination = builder.buildUnchecked();
        Assertions.assertThat(snsDestination).isInstanceOf(SnsDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SnsDestination.builder().accessKey("accessKey") },
                new Object[] { SnsDestination.builder().accessSecret("accessSecret") },
                new Object[] { SnsDestination.builder().topicArn("topicArn") },
                new Object[] { SnsDestination.builder()
                        .authenticationMode(com.commercetools.api.models.subscription.AwsAuthenticationMode
                                .findEnum("Credentials")) } };
    }

    @Test
    public void accessKey() {
        SnsDestination value = SnsDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }

    @Test
    public void accessSecret() {
        SnsDestination value = SnsDestination.of();
        value.setAccessSecret("accessSecret");
        Assertions.assertThat(value.getAccessSecret()).isEqualTo("accessSecret");
    }

    @Test
    public void topicArn() {
        SnsDestination value = SnsDestination.of();
        value.setTopicArn("topicArn");
        Assertions.assertThat(value.getTopicArn()).isEqualTo("topicArn");
    }

    @Test
    public void authenticationMode() {
        SnsDestination value = SnsDestination.of();
        value.setAuthenticationMode(
            com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
    }
}
