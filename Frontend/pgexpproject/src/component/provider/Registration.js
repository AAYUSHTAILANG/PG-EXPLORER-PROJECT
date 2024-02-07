import React, { useState } from 'react';

function Registration() {
  const [providerName, setProviderName] = useState('');
  const [providerEmail, setProviderEmail] = useState('');
  const [contactNumber, setContactNumber] = useState('');
  const [address, setAddress] = useState('');
  const [registrationDate, setRegistrationDate] = useState('');

  const handleProviderNameChange = (event) => {
    setProviderName(event.target.value);
  };

  const handleProviderEmailChange = (event) => {
    setProviderEmail(event.target.value);
  };

  const handleContactNumberChange = (event) => {
    setContactNumber(event.target.value);
  };

  const handleAddressChange = (event) => {
    setAddress(event.target.value);
  };

  const handleRegistrationDateChange = (event) => {
    setRegistrationDate(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    // Perform registration logic here
    console.log('Provider Name:', providerName);
    console.log('Provider Email:', providerEmail);
    console.log('Contact Number:', contactNumber);
    console.log('Address:', address);
    console.log('Registration Date:', registrationDate);
    // Reset form fields after submission
    setProviderName('');
    setProviderEmail('');
    setContactNumber('');
    setAddress('');
    setRegistrationDate('');
  };

  return (
    <div className="container mt-5">
      <div className="row justify-content-center">
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">
              <h2 className="text-center mb-4">Provider Registration</h2>
              <form onSubmit={handleSubmit}>
                <div className="mb-3 row align-items-center">
                  <label htmlFor="providerName" className="col-sm-3 col-form-label">Provider Name</label>
                  <div className="col-sm-9">
                    <input
                      type="text"
                      className="form-control"
                      id="providerName"
                      value={providerName}
                      onChange={handleProviderNameChange}
                      required
                    />
                  </div>
                </div>
                <div className="mb-3 row align-items-center">
                  <label htmlFor="providerEmail" className="col-sm-3 col-form-label">Provider Email</label>
                  <div className="col-sm-9">
                    <input
                      type="email"
                      className="form-control"
                      id="providerEmail"
                      value={providerEmail}
                      onChange={handleProviderEmailChange}
                      required
                    />
                  </div>
                </div>
                <div className="mb-3 row align-items-center">
                  <label htmlFor="contactNumber" className="col-sm-3 col-form-label">Contact Number</label>
                  <div className="col-sm-9">
                    <input
                      type="tel"
                      className="form-control"
                      id="contactNumber"
                      value={contactNumber}
                      onChange={handleContactNumberChange}
                      required
                    />
                  </div>
                </div>
                <div className="mb-3 row align-items-center">
                  <label htmlFor="address" className="col-sm-3 col-form-label">Address</label>
                  <div className="col-sm-9">
                    <textarea
                      className="form-control"
                      id="address"
                      rows="3"
                      value={address}
                      onChange={handleAddressChange}
                      required
                    ></textarea>
                  </div>
                </div>
                <div className="mb-3 row align-items-center">
                  <label htmlFor="registrationDate" className="col-sm-3 col-form-label">Registration Date</label>
                  <div className="col-sm-9">
                    <input
                      type="date"
                      className="form-control"
                      id="registrationDate"
                      value={registrationDate}
                      onChange={handleRegistrationDateChange}
                      required
                    />
                  </div>
                </div>
                <button type="submit" className="btn btn-primary btn-block">Register</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Registration;
