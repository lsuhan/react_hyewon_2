
import React from 'react';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import HeaderComponent from './components/common/HeaderComponent';
import FooterComponent from './components/common/FooterComponent';
import ListMenuComponent from './components/menu/ListMenuComponent';

function App() {
  return (

      <div>
          <HeaderComponent />
          <div className="container">
              <Router>
                  <Routes>
          {/*            <Route path = "/"  element={<ListMenuComponent />}></Route>*/}
                  </Routes>
              </Router>
          </div>
          <FooterComponent/>
      </div>
  );
}

export default App;
