
package com.commercetools.api.models.warning;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * WarningObjectBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class WarningObjectBuilder {

    public com.commercetools.api.models.warning.CannotChangeReservationExpiryWarningBuilder cannotChangeReservationExpiryBuilder() {
        return com.commercetools.api.models.warning.CannotChangeReservationExpiryWarningBuilder.of();
    }

    public com.commercetools.api.models.warning.CannotCreateReservationWarningBuilder cannotCreateReservationBuilder() {
        return com.commercetools.api.models.warning.CannotCreateReservationWarningBuilder.of();
    }

    public com.commercetools.api.models.warning.CannotUpdateReservationWarningBuilder cannotUpdateReservationBuilder() {
        return com.commercetools.api.models.warning.CannotUpdateReservationWarningBuilder.of();
    }

    public com.commercetools.api.models.warning.ImageProcessingOngoingWarningBuilder imageProcessingOngoingBuilder() {
        return com.commercetools.api.models.warning.ImageProcessingOngoingWarningBuilder.of();
    }

    /**
     * factory method for an instance of WarningObjectBuilder
     * @return builder
     */
    public static WarningObjectBuilder of() {
        return new WarningObjectBuilder();
    }

}
