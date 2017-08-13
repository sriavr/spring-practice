package com.sridhar.service;



import com.sridhar.model.Avatar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RakshasaSamharaService {

    private Avatar avatar;

    private Avatar kaliyugaAvatar;

    public Avatar getAvatar() {
        return avatar;
    }

    @Autowired(required = true)
    public void setAvatar(@Qualifier("krishna") Avatar avatar) {
        this.avatar = avatar;
    }

    public Avatar getKaliyugaAvatar() {
        return kaliyugaAvatar;
    }

    @Autowired(required = true)
    public void setKaliyugaAvatar(@Qualifier("chaitanya") Avatar kaliyugaAvatar) {
        this.kaliyugaAvatar = kaliyugaAvatar;
    }

    public void doRakshasaSamhara(){
        avatar.vinashayachaDushkrutam();
        kaliyugaAvatar.dharmaSamsthapanam();
    }
}
