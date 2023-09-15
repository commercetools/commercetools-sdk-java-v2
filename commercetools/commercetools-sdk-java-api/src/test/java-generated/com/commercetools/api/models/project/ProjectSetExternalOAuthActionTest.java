
package com.commercetools.api.models.project;

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
public class ProjectSetExternalOAuthActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectSetExternalOAuthActionBuilder builder) {
        ProjectSetExternalOAuthAction projectSetExternalOAuthAction = builder.buildUnchecked();
        Assertions.assertThat(projectSetExternalOAuthAction).isInstanceOf(ProjectSetExternalOAuthAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectSetExternalOAuthAction.builder()
                .externalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl()) } };
    }

    @Test
    public void externalOAuth() {
        ProjectSetExternalOAuthAction value = ProjectSetExternalOAuthAction.of();
        value.setExternalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl());
        Assertions.assertThat(value.getExternalOAuth())
                .isEqualTo(new com.commercetools.api.models.project.ExternalOAuthImpl());
    }
}
