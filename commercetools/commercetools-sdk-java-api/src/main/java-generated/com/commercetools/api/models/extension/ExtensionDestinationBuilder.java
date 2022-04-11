
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionDestinationBuilder {

    public com.commercetools.api.models.extension.AWSLambdaDestinationBuilder awsLambdaBuilder() {
        return com.commercetools.api.models.extension.AWSLambdaDestinationBuilder.of();
    }

    public com.commercetools.api.models.extension.HttpDestinationBuilder httpBuilder() {
        return com.commercetools.api.models.extension.HttpDestinationBuilder.of();
    }

    public static ExtensionDestinationBuilder of() {
        return new ExtensionDestinationBuilder();
    }
}
