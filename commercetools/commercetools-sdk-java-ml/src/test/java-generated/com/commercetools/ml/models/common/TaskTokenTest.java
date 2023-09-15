
package com.commercetools.ml.models.common;

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
public class TaskTokenTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaskTokenBuilder builder) {
        TaskToken taskToken = builder.buildUnchecked();
        Assertions.assertThat(taskToken).isInstanceOf(TaskToken.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaskToken.builder().taskId("taskId") },
                new Object[] { TaskToken.builder().uriPath("uriPath") } };
    }

    @Test
    public void taskId() {
        TaskToken value = TaskToken.of();
        value.setTaskId("taskId");
        Assertions.assertThat(value.getTaskId()).isEqualTo("taskId");
    }

    @Test
    public void uriPath() {
        TaskToken value = TaskToken.of();
        value.setUriPath("uriPath");
        Assertions.assertThat(value.getUriPath()).isEqualTo("uriPath");
    }
}
