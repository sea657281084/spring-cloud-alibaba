package com.buba.payment.serviceImp;

import com.buba.payment.dao.PaymentDao;
import com.buba.payment.service.PaymentService;
import com.buba.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentImple
 * @Description TODO
 * @Author LHQ
 * @Date 2022/10/25 17:36
 */
@Service
public class PaymentImple implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
