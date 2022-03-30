
package com.commercetools.history.defaultconfig;

import com.commercetools.history.models.change_history.RecordPagedQueryResponse;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HistoryIntegrationTests {

    @Test
    public void createAndDelete() {
        final ApiHttpResponse<RecordPagedQueryResponse> response = HistoryApiTestUtils.getProjectRoot()
                .get()
                .executeBlocking();

        Assertions.assertNotNull(response.getBody());
    }
}
