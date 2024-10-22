
package com.commerctools.importapi;

import com.commercetools.importapi.models.errors.DuplicateAttributeValueError;
import com.commercetools.importapi.models.errors.ErrorResponse;
import com.commercetools.importapi.models.productvariants.LocalizableTextAttribute;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SerializerTest {

    @Test
    public void shouldCorrectlyDeserializeError() {
        String t = """
                {
                    "version": 2,
                    "importContainerKey": "product-index-all",
                    "resourceKey": "5098_NZ",
                    "id": "e3708a0b-18d3-4dd5-ba5d-4d59eaff48de",
                    "state": "validationFailed",
                    "errors": [
                        {
                            "code": "DuplicateAttributeValue",
                            "message": "Attribute can't have the same value in a different variant.",
                            "attribute": {
                                "name": "slug",
                                "value": {
                                    "en-NZ": "light-medium"
                                }
                            }
                        }
                    ],
                    "createdAt": "2024-10-02T06:39:12.614Z",
                    "lastModifiedAt": "2024-10-02T06:39:52.840Z",
                    "expiresAt": "2024-10-04T06:39:12.614Z"
                }
                """;
        ErrorResponse errorResponse = JsonUtils.fromJsonString(t, ErrorResponse.class);
        Assertions.assertThat(errorResponse.getErrors()).hasSize(1);
        LocalizableTextAttribute value = (LocalizableTextAttribute) ((DuplicateAttributeValueError) errorResponse
                .getErrors()
                .get(0)).getAttribute();
        Assertions.assertThat(value.getValue().values().get("en-NZ")).isEqualTo("light-medium");
    }
}
