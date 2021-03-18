
package com.commercetools.history.defaultconfig;

import com.commercetools.history.models.ChangeHistoryPagedQueryResponse;

import io.vrap.rmf.base.client.ApiHttpResponse;
import org.junit.Assert;
import org.junit.Test;

public class HistoryIntegrationTests {

    @Test
    public void createAndDelete() {
        final ApiHttpResponse<ChangeHistoryPagedQueryResponse> response = HistoryApiTestUtils.getProjectRoot().get().executeBlocking();

        Assert.assertNotNull(response.getBody());
    }
}
