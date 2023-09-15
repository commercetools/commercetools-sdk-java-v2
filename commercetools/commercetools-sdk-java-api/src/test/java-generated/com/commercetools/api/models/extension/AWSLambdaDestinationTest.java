
package com.commercetools.api.models.extension;

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
public class AWSLambdaDestinationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AWSLambdaDestinationBuilder builder) {
        AWSLambdaDestination aWSLambdaDestination = builder.buildUnchecked();
        Assertions.assertThat(aWSLambdaDestination).isInstanceOf(AWSLambdaDestination.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AWSLambdaDestination.builder().arn("arn") },
                new Object[] { AWSLambdaDestination.builder().accessKey("accessKey") },
                new Object[] { AWSLambdaDestination.builder().accessSecret("accessSecret") } };
    }

    @Test
    public void arn() {
        AWSLambdaDestination value = AWSLambdaDestination.of();
        value.setArn("arn");
        Assertions.assertThat(value.getArn()).isEqualTo("arn");
    }

    @Test
    public void accessKey() {
        AWSLambdaDestination value = AWSLambdaDestination.of();
        value.setAccessKey("accessKey");
        Assertions.assertThat(value.getAccessKey()).isEqualTo("accessKey");
    }

    @Test
    public void accessSecret() {
        AWSLambdaDestination value = AWSLambdaDestination.of();
        value.setAccessSecret("accessSecret");
        Assertions.assertThat(value.getAccessSecret()).isEqualTo("accessSecret");
    }
}
