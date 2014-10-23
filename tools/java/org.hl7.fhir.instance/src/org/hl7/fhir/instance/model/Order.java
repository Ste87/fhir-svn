package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Thu, Oct 23, 2014 13:30+1100 for FHIR v0.3.0

import java.util.*;

/**
 * A request to perform an action.
 */
public class Order extends Resource {

    public static class OrderWhenComponent extends BackboneElement {
        /**
         * Code specifies when request should be done. The code may simply be a priority code.
         */
        protected CodeableConcept code;

        /**
         * A formal schedule.
         */
        protected Timing schedule;

        private static final long serialVersionUID = 307115287L;

      public OrderWhenComponent() {
        super();
      }

        /**
         * @return {@link #code} (Code specifies when request should be done. The code may simply be a priority code.)
         */
        public CodeableConcept getCode() { 
          return this.code;
        }

        /**
         * @param value {@link #code} (Code specifies when request should be done. The code may simply be a priority code.)
         */
        public OrderWhenComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #schedule} (A formal schedule.)
         */
        public Timing getSchedule() { 
          return this.schedule;
        }

        /**
         * @param value {@link #schedule} (A formal schedule.)
         */
        public OrderWhenComponent setSchedule(Timing value) { 
          this.schedule = value;
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("code", "CodeableConcept", "Code specifies when request should be done. The code may simply be a priority code.", 0, java.lang.Integer.MAX_VALUE, code));
          childrenList.add(new Property("schedule", "Timing", "A formal schedule.", 0, java.lang.Integer.MAX_VALUE, schedule));
        }

      public OrderWhenComponent copy() {
        OrderWhenComponent dst = new OrderWhenComponent();
        dst.code = code == null ? null : code.copy();
        dst.schedule = schedule == null ? null : schedule.copy();
        return dst;
      }

  }

    /**
     * Identifiers assigned to this order by the orderer or by the receiver.
     */
    protected List<Identifier> identifier = new ArrayList<Identifier>();

    /**
     * When the order was made.
     */
    protected DateTimeType date;

    /**
     * Patient this order is about.
     */
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Patient this order is about.)
     */
    protected Patient subjectTarget;

    /**
     * Who initiated the order.
     */
    protected Reference source;

    /**
     * The actual object that is the target of the reference (Who initiated the order.)
     */
    protected Practitioner sourceTarget;

    /**
     * Who is intended to fulfill the order.
     */
    protected Reference target;

    /**
     * The actual object that is the target of the reference (Who is intended to fulfill the order.)
     */
    protected Resource targetTarget;

    /**
     * Text - why the order was made.
     */
    protected Type reason;

    /**
     * If required by policy.
     */
    protected Reference authority;

    /**
     * The actual object that is the target of the reference (If required by policy.)
     */
    protected Resource authorityTarget;

    /**
     * When order should be fulfilled.
     */
    protected OrderWhenComponent when;

    /**
     * What action is being ordered.
     */
    protected List<Reference> detail = new ArrayList<Reference>();
    /**
     * The actual objects that are the target of the reference (What action is being ordered.)
     */
    protected List<Resource> detailTarget = new ArrayList<Resource>();


    private static final long serialVersionUID = -1949835634L;

    public Order() {
      super();
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order by the orderer or by the receiver.)
     */
    public List<Identifier> getIdentifier() { 
      return this.identifier;
    }

    /**
     * @return {@link #identifier} (Identifiers assigned to this order by the orderer or by the receiver.)
     */
    // syntactic sugar
    public Identifier addIdentifier() { 
      Identifier t = new Identifier();
      this.identifier.add(t);
      return t;
    }

    /**
     * @return {@link #date} (When the order was made.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      return this.date;
    }

    /**
     * @param value {@link #date} (When the order was made.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Order setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return When the order was made.
     */
    public DateAndTime getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value When the order was made.
     */
    public Order setDate(DateAndTime value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #subject} (Patient this order is about.)
     */
    public Reference getSubject() { 
      return this.subject;
    }

    /**
     * @param value {@link #subject} (Patient this order is about.)
     */
    public Order setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Patient this order is about.)
     */
    public Patient getSubjectTarget() { 
      return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Patient this order is about.)
     */
    public Order setSubjectTarget(Patient value) { 
      this.subjectTarget = value;
      return this;
    }

    /**
     * @return {@link #source} (Who initiated the order.)
     */
    public Reference getSource() { 
      return this.source;
    }

    /**
     * @param value {@link #source} (Who initiated the order.)
     */
    public Order setSource(Reference value) { 
      this.source = value;
      return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who initiated the order.)
     */
    public Practitioner getSourceTarget() { 
      return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who initiated the order.)
     */
    public Order setSourceTarget(Practitioner value) { 
      this.sourceTarget = value;
      return this;
    }

    /**
     * @return {@link #target} (Who is intended to fulfill the order.)
     */
    public Reference getTarget() { 
      return this.target;
    }

    /**
     * @param value {@link #target} (Who is intended to fulfill the order.)
     */
    public Order setTarget(Reference value) { 
      this.target = value;
      return this;
    }

    /**
     * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who is intended to fulfill the order.)
     */
    public Resource getTargetTarget() { 
      return this.targetTarget;
    }

    /**
     * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who is intended to fulfill the order.)
     */
    public Order setTargetTarget(Resource value) { 
      this.targetTarget = value;
      return this;
    }

    /**
     * @return {@link #reason} (Text - why the order was made.)
     */
    public Type getReason() { 
      return this.reason;
    }

    /**
     * @param value {@link #reason} (Text - why the order was made.)
     */
    public Order setReason(Type value) { 
      this.reason = value;
      return this;
    }

    /**
     * @return {@link #authority} (If required by policy.)
     */
    public Reference getAuthority() { 
      return this.authority;
    }

    /**
     * @param value {@link #authority} (If required by policy.)
     */
    public Order setAuthority(Reference value) { 
      this.authority = value;
      return this;
    }

    /**
     * @return {@link #authority} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (If required by policy.)
     */
    public Resource getAuthorityTarget() { 
      return this.authorityTarget;
    }

    /**
     * @param value {@link #authority} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (If required by policy.)
     */
    public Order setAuthorityTarget(Resource value) { 
      this.authorityTarget = value;
      return this;
    }

    /**
     * @return {@link #when} (When order should be fulfilled.)
     */
    public OrderWhenComponent getWhen() { 
      return this.when;
    }

    /**
     * @param value {@link #when} (When order should be fulfilled.)
     */
    public Order setWhen(OrderWhenComponent value) { 
      this.when = value;
      return this;
    }

    /**
     * @return {@link #detail} (What action is being ordered.)
     */
    public List<Reference> getDetail() { 
      return this.detail;
    }

    /**
     * @return {@link #detail} (What action is being ordered.)
     */
    // syntactic sugar
    public Reference addDetail() { 
      Reference t = new Reference();
      this.detail.add(t);
      return t;
    }

    /**
     * @return {@link #detail} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. What action is being ordered.)
     */
    public List<Resource> getDetailTarget() { 
      return this.detailTarget;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "Identifiers assigned to this order by the orderer or by the receiver.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("date", "dateTime", "When the order was made.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("subject", "Reference(Patient)", "Patient this order is about.", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("source", "Reference(Practitioner)", "Who initiated the order.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("target", "Reference(Organization|Device|Practitioner)", "Who is intended to fulfill the order.", 0, java.lang.Integer.MAX_VALUE, target));
        childrenList.add(new Property("reason[x]", "CodeableConcept|Reference(Any)", "Text - why the order was made.", 0, java.lang.Integer.MAX_VALUE, reason));
        childrenList.add(new Property("authority", "Reference(Any)", "If required by policy.", 0, java.lang.Integer.MAX_VALUE, authority));
        childrenList.add(new Property("when", "", "When order should be fulfilled.", 0, java.lang.Integer.MAX_VALUE, when));
        childrenList.add(new Property("detail", "Reference(Any)", "What action is being ordered.", 0, java.lang.Integer.MAX_VALUE, detail));
      }

      public Order copy() {
        Order dst = new Order();
        dst.identifier = new ArrayList<Identifier>();
        for (Identifier i : identifier)
          dst.identifier.add(i.copy());
        dst.date = date == null ? null : date.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.source = source == null ? null : source.copy();
        dst.target = target == null ? null : target.copy();
        dst.reason = reason == null ? null : reason.copy();
        dst.authority = authority == null ? null : authority.copy();
        dst.when = when == null ? null : when.copy();
        dst.detail = new ArrayList<Reference>();
        for (Reference i : detail)
          dst.detail.add(i.copy());
        return dst;
      }

      protected Order typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Order;
   }


}

