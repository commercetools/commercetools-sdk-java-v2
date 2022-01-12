
package com.commercetools.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;

import com.commercetools.ml.models.image_search.ImageSearchResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UploadImageTest extends TestBase {

    @Disabled
    @Test
    public void uploadImageTest() throws JsonProcessingException {

        ApiHttpResponse<ImageSearchResponse> response = mlApiBuilder.imageSearch()
                .post(new File("src/test/resources/example_flower.jpg"))
                .addHeader("Content-Type", "image/jpeg")
                .executeBlocking();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

}
