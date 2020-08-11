package com.commercetools.api;

import com.commercetools.ml.models.image_search.ImageSearchResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.junit.Test;

import java.io.File;
import static org.assertj.core.api.Assertions.assertThat;

public class UploadImageTest extends TestBase {

    @Test
    public void uploadImageTest() throws JsonProcessingException {

         ApiHttpResponse<ImageSearchResponse> response = mlApiBuilder.imageSearch()
                .post(new File("src/test/resources/example_flower.jpg"))
                .addHeader("Content-Type", "image/jpeg")
                .executeBlocking();
         assertThat(response.getStatusCode()).isEqualTo(200);
    }

}
