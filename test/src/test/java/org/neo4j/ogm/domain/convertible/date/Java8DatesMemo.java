/*
 * Copyright (c) 2002-2017 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 *  conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package org.neo4j.ogm.domain.convertible.date;


import java.time.*;
import java.util.List;

import org.neo4j.ogm.annotation.typeconversion.DateLong;

/**
 * @author Nicolas Mervaillie
 */
public class Java8DatesMemo {

    private Long id;
    private String memo;

    private Instant recorded;

    @DateLong
    private Instant closed;

    private LocalDate approved;

    private List<LocalDate> dateList;

    private LocalDateTime dateTime;

    private List<LocalDateTime> dateTimeList;

    private OffsetDateTime offsetDateTime;

    private List<OffsetDateTime> offsetDateTimeList;

    public Java8DatesMemo() {
    }

    public Java8DatesMemo(Instant initial) {
        this.recorded = initial;
        this.closed = initial;
        this.approved = LocalDateTime.ofInstant(initial, ZoneOffset.UTC).toLocalDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Instant getRecorded() {
        return recorded;
    }

    public void setRecorded(Instant recorded) {
        this.recorded = recorded;
    }

    public LocalDate getApproved() {
        return approved;
    }

    public void setApproved(LocalDate approved) {
        this.approved = approved;
    }

    public Instant getClosed() {
        return closed;
    }

    public void setClosed(Instant closed) {
        this.closed = closed;
    }


    public List<LocalDate> getDateList() {
        return dateList;
    }

    public void setDateList(List<LocalDate> dateList) {
        this.dateList = dateList;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<LocalDateTime> getDateTimeList() {
        return dateTimeList;
    }

    public void setDateTimeList(List<LocalDateTime> dateTimeList) {
        this.dateTimeList = dateTimeList;
    }

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public void setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.offsetDateTime = offsetDateTime;
    }

    public List<OffsetDateTime> getOffsetDateTimeList() {
        return offsetDateTimeList;
    }

    public void setOffsetDateTimeList(List<OffsetDateTime> offsetDateTimeList) {
        this.offsetDateTimeList = offsetDateTimeList;
    }
}
