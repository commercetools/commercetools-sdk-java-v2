
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionDestinationBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionDestinationBuilder {

    public com.commercetools.api.models.extension.AWSLambdaDestinationBuilder awsLambdaBuilder() {
        return com.commercetools.api.models.extension.AWSLambdaDestinationBuilder.of();
    }

    public com.commercetools.api.models.extension.GoogleCloudFunctionDestinationBuilder googleCloudFunctionBuilder() {
        return com.commercetools.api.models.extension.GoogleCloudFunctionDestinationBuilder.of();
    }

    public com.commercetools.api.models.extension.HttpDestinationBuilder httpBuilder() {
        return com.commercetools.api.models.extension.HttpDestinationBuilder.of();
    }

    /**
     * factory method for an instance of ExtensionDestinationBuilder
     * @return builder
     */
    public static ExtensionDestinationBuilder of() {
        return new ExtensionDestinationBuilder();
    }
}
