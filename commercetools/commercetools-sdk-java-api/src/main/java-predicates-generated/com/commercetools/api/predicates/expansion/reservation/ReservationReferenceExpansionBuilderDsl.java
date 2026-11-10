
package com.commercetools.api.predicates.expansion.reservation;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ReservationReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ReservationReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ReservationReferenceExpansionBuilderDsl of() {
        return new ReservationReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ReservationReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ReservationReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.reservation.ReservationExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.reservation.ReservationExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
