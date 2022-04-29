
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.commercetools.api.models.error.InvalidJsonInputError;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

public class ErrorTest {
    @Test
    public void deprecatedAttributesAccessor() throws IOException {
        ErrorResponse errorResponse = JsonUtils.fromJsonString(stringFromResource("errors.json"), ErrorResponse.class);

        ErrorObject errorObject = errorResponse.getErrors().get(0);
        assertThat(errorObject).isInstanceOf(InvalidJsonInputError.class);

        final InvalidJsonInputError error = (InvalidJsonInputError) errorObject;
        assertThat(error.values().get("detailedErrorMessage")).isEqualTo("actions -> name: Missing required value");
    }
}
