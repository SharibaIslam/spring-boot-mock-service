package com.jpadb.jpa.entity;


import javax.persistence.*;


@Entity
@Table(name="otp_log",schema ="${myApp.schemaName}" )
public class OTPRead {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    /*@Column(name = "channel",nullable = false)
    private String _channel;*/

    @Column(name = "code",nullable = false)
    private String _code;

    /*@Column(name = "event",nullable = false)
    private String _event;*/

    @Column(name = "mobile_no",nullable = false)
    private String _mobile;

    /*@Column(name = "otp_generation_time",nullable = false)
    private Date _date;*/


    /*public String get_channel() {
        return _channel;
    }

    public void set_channel(String _channel) {
        this._channel = _channel;
    }
*/
    public String get_code() {
        return _code;
    }

    public void set_code(String _code) {
        this._code = _code;
    }

   /* public String get_event() {
        return _event;
    }

    public void set_event(String _event) {
        this._event = _event;
    }*/

    public String get_mobile() {
        return _mobile;
    }

    public void set_mobile(String _mobile) {
        this._mobile = _mobile;
    }

    /*public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }*/

}
