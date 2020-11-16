export const age = (planet, seconds) => {
  // var divider =
  return Number(((seconds * (ORBS['earth'] / ORBS[planet])) / (EARTH_SECONDS)).toFixed(2))
};

export const EARTH_SECONDS = 31557600

export const ORBS = {
  'mercury' : 0.2408467,
  'venus' : 0.61519726,
  'earth' : 1.0,
  'mars' : 1.8808158,
  'jupiter' : 11.862615,
  'saturn' : 29.447498,
  'uranus' : 84.016846,
  'neptune' : 164.79132
}
