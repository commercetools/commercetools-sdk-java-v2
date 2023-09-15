
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
public class SqsDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SqsDestinationBuilder builder) {
        SqsDestination sqsDestination = builder.buildUnchecked();
        Assertions.assertThat(sqsDestination).isInstanceOf(SqsDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SqsDestination.builder().accessKey("accessKey") },
                new Object[] { SqsDestination.builder().accessSecret("accessSecret") },
                new Object[] { SqsDestination.builder().queueUrl("queueUrl") },
                new Object[] { SqsDestination.builder().region("region") },
                new Object[] { SqsDestination.builder()
                        .authenticationMode(com.commercetools.api.models.subscription.AwsAuthenticationMode
                                .findEnum("Credentials")) } };
    }

    @Test
    public void accessKey() {
        SqsDestination value = SqsDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }

    @Test
    public void accessSecret() {
        SqsDestination value = SqsDestination.of();
        value.setAccessSecret("accessSecret");
        Assertions.assertThat(value.getAccessSecret()).isEqualTo("accessSecret");
    }

    @Test
    public void queueUrl() {
        SqsDestination value = SqsDestination.of();
        value.setQueueUrl("queueUrl");
        Assertions.assertThat(value.getQueueUrl()).isEqualTo("queueUrl");
    }

    @Test
    public void region() {
        SqsDestination value = SqsDestination.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void authenticationMode() {
        SqsDestination value = SqsDestination.of();
        value.setAuthenticationMode(
            com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(com.commercetools.api.models.subscription.AwsAuthenticationMode.findEnum("Credentials"));
    }
}
