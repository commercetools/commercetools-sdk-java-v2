
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorObjectBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ErrorObjectBuilder {

    public com.commercetools.checkout.models.error.ConcurrentModificationErrorBuilder concurrentModificationBuilder() {
        return com.commercetools.checkout.models.error.ConcurrentModificationErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.ConnectorFailedErrorBuilder connectorFailedBuilder() {
        return com.commercetools.checkout.models.error.ConnectorFailedErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.DuplicateFieldWithConflictingResourceErrorBuilder duplicateFieldWithConflictingResourceBuilder() {
        return com.commercetools.checkout.models.error.DuplicateFieldWithConflictingResourceErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.GeneralErrorBuilder generalBuilder() {
        return com.commercetools.checkout.models.error.GeneralErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.InvalidFieldErrorBuilder invalidFieldBuilder() {
        return com.commercetools.checkout.models.error.InvalidFieldErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.InvalidInputErrorBuilder invalidInputBuilder() {
        return com.commercetools.checkout.models.error.InvalidInputErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.InvalidJsonInputErrorBuilder invalidJsonInputBuilder() {
        return com.commercetools.checkout.models.error.InvalidJsonInputErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.InvalidOperationErrorBuilder invalidOperationBuilder() {
        return com.commercetools.checkout.models.error.InvalidOperationErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.MaxResourceLimitExceededErrorBuilder maxResourceLimitExceededBuilder() {
        return com.commercetools.checkout.models.error.MaxResourceLimitExceededErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.MissingProjectKeyErrorBuilder missingProjectKeyBuilder() {
        return com.commercetools.checkout.models.error.MissingProjectKeyErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.MultipleActionsNotAllowedErrorBuilder multipleActionsNotAllowedBuilder() {
        return com.commercetools.checkout.models.error.MultipleActionsNotAllowedErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.PaymentFailureErrorBuilder paymentFailureBuilder() {
        return com.commercetools.checkout.models.error.PaymentFailureErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.ReferencedResourceNotFoundErrorBuilder referencedResourceNotFoundBuilder() {
        return com.commercetools.checkout.models.error.ReferencedResourceNotFoundErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.RequiredFieldErrorBuilder requiredFieldBuilder() {
        return com.commercetools.checkout.models.error.RequiredFieldErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.ResourceNotFoundErrorBuilder resourceNotFoundBuilder() {
        return com.commercetools.checkout.models.error.ResourceNotFoundErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.ServiceUnavailableErrorBuilder serviceUnavailableBuilder() {
        return com.commercetools.checkout.models.error.ServiceUnavailableErrorBuilder.of();
    }

    public com.commercetools.checkout.models.error.SyntaxErrorErrorBuilder syntaxErrorBuilder() {
        return com.commercetools.checkout.models.error.SyntaxErrorErrorBuilder.of();
    }

    /**
     * factory method for an instance of ErrorObjectBuilder
     * @return builder
     */
    public static ErrorObjectBuilder of() {
        return new ErrorObjectBuilder();
    }

}
