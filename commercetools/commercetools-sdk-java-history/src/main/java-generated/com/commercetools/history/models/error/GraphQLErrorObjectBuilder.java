
package com.commercetools.history.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLErrorObjectBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorObjectBuilder {

    public com.commercetools.history.models.error.GraphQLTooManyRequestsErrorBuilder tooManyRequestsBuilder() {
        return com.commercetools.history.models.error.GraphQLTooManyRequestsErrorBuilder.of();
    }

    /**
     * factory method for an instance of GraphQLErrorObjectBuilder
     * @return builder
     */
    public static GraphQLErrorObjectBuilder of() {
        return new GraphQLErrorObjectBuilder();
    }

}
